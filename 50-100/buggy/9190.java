@java.lang.Override
public void onClick(android.view.View v) {
    int fragCount = ((com.dmcapps.navigationfragmentexample.SingleStackExample.SampleFragment) (this.getNavigationManager().topFragment())).getFragCount();
    this.presentFragment(com.dmcapps.navigationfragmentexample.SingleStackExample.SampleFragment.newInstance("Fragment added to the Stack", (fragCount + 1)));
}