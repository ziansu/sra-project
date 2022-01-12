@java.lang.Override
public void onEmployeeLoadingComplete() {
    setAllEmployees();
    myRA = getRA(mRaEmail);
    mHallName = myRA.getHall();
    mFloor = myRA.getFloor();
    mUser = getEmployee(mEmail);
    mDutyRosterLoader = new edu.rosehulman.rafinder.loader.DutyRosterLoader(mHallName, this, mAllRAs, false);
}