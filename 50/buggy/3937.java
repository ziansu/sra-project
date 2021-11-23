public static com.tudarmstadt.barrierefreiesrouting.datacollectionapp.ui.fragments.ObstacleDetailsFragment newInstance(bp.common.model.Obstacle obstacle) {
    com.tudarmstadt.barrierefreiesrouting.datacollectionapp.ui.fragments.ObstacleDetailsFragment fragment = new com.tudarmstadt.barrierefreiesrouting.datacollectionapp.ui.fragments.ObstacleDetailsFragment();
    android.os.Bundle args = new android.os.Bundle();
    fragment.obstacleToEdit = obstacle;
    fragment.setArguments(args);
    return fragment;
}