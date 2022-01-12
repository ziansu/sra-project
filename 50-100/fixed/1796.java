@java.lang.Override
public void onCreate(@android.support.annotation.Nullable
android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    mvp.model.repository.local.GameLocalDataSource gameLocalDataSource = new mvp.model.repository.local.GameLocalDataSource(getContext().getApplicationContext());
    mvp.model.repository.remote.GameRemoteDataSource gameRemoteDataSource = new mvp.model.repository.remote.GameRemoteDataSource();
    mvp.model.repository.GameRepository gameRepository = new mvp.model.repository.GameRepository(gameLocalDataSource, gameRemoteDataSource);
    mvp.model.repository.ScoresLoader scoresLoader = new mvp.model.repository.ScoresLoader(getContext().getApplicationContext(), gameRepository);
    scoresPresenter = new mvp.view.scores.ScoresPresenter(this, scoresLoader, getLoaderManager());
    scoresPresenter.start();
}