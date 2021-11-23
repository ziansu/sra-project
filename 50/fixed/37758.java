private void initializeNavigationListener() {
    android.support.design.widget.BottomNavigationView navigation = ((android.support.design.widget.BottomNavigationView) (activity.findViewById(R.id.navigation)));
    java.lang.System.out.println(navigation);
    navigation.setSelectedItemId(R.id.navigation_notifications);
}