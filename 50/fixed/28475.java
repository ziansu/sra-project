@java.lang.Override
public void onViewCreated(android.view.View view, @android.support.annotation.Nullable
android.os.Bundle savedInstanceState) {
    super.onViewCreated(view, savedInstanceState);
    main = ((com.soctec.soctec.core.MainActivity) (getActivity()));
    main.updateAchievementFragment();
}