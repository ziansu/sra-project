private void showDetails() {
    java.lang.System.out.println((((dynafios.trace.fragment.SubmitFragment.TAG) + " : save complete selectedIndex :") + (selectedIndex)));
    displayDetails(new dynafios.trace.fragment.SubmitWithDetailsFragment(getValues(), selectedIndex, dates));
}