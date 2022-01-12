@java.lang.Override
public void onEmployeeLoadingComplete() {
    setAllEmployees();
    myRA = getRA(mRaEmail);
    mUser = getEmployee(mEmail);
    mHallName = myRA.getHall();
    mFloor = myRA.getFloor();
    mDutyRosterLoader = new edu.rosehulman.rafinder.loader.DutyRosterLoader(mHallName, this, mAllRAs, false);
}