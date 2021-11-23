@com.framgia.wsm.utils.dagger.FragmentScope
@dagger.Provides
public ProfileContract.ViewModel provideViewModel(com.framgia.wsm.screen.profile.ProfileContract.Presenter presenter, com.framgia.wsm.utils.navigator.Navigator navigator, com.framgia.wsm.screen.profile.branch.BranchAdapter branchAdapter, com.framgia.wsm.screen.profile.group.GroupAdapter groupAdapter) {
    return new com.framgia.wsm.screen.profile.ProfileViewModel(presenter, navigator, branchAdapter, groupAdapter);
}