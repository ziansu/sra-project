@java.lang.Override
public void onBranchChoosen(com.hammwerk.wizardpager.core.BranchPage branchPage) {
    com.hammwerk.wizardpager.core.Branch choosenBranch = branchPage.getSelectedBranch();
    for (com.hammwerk.wizardpager.core.Page i : choosenBranch.getPages()) {
        i.setPageListener(pageListener);
    }
    com.hammwerk.wizardpager.core.BranchPage nextBranchPage = choosenBranch.getBranchPage();
    if (nextBranchPage != null) {
        nextBranchPage.setBranchPageListener(this);
    }
}