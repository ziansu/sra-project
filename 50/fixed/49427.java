@java.lang.Override
public android.content.Loader<java.util.List<fr.sims.coachingproject.model.Group>> onCreateLoader(int id, android.os.Bundle args) {
    return new fr.sims.coachingproject.loader.local.GroupLoader(getActivity());
}