private void initFragment() {
    fragmentManager = getSupportFragmentManager();
    fragmentArrayList = new java.util.ArrayList<android.support.v4.app.Fragment>();
    firstFragment = new online.himakeit.skylarkdemo.fragment.FirstFragment();
    secondFragment = new online.himakeit.skylarkdemo.fragment.SecondFragment();
    thirdFragment = new online.himakeit.skylarkdemo.fragment.ThirdFragment();
    fragmentArrayList.add(firstFragment);
    fragmentArrayList.add(secondFragment);
    fragmentArrayList.add(thirdFragment);
}