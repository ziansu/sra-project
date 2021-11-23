@java.lang.Override
public void onInitViewContent() {
    super.onInitViewContent();
    int position = com.ogaclejapan.smarttablayout.utils.v4.FragmentPagerItem.getPosition(getArguments());
    addProfileFieldForDetailsPage(caseRegisterPresenter.getFields(position));
}