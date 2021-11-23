public void onEvent(org.starfishrespect.myconsumption.android.events.FragmentsReadyEvent event) {
    if (event.getFragmentClass().getName().equals(org.starfishrespect.myconsumption.android.ui.ChartChoiceFragment.class.getName()))
        this.chartChoiceReady = true;
    
    if (event.getFragmentClass().getName().equals(org.starfishrespect.myconsumption.android.ui.ChartViewFragment.class.getName()))
        this.chartViewReady = true;
    
    if ((chartChoiceReady) && (chartViewReady)) {
        init();
        this.chartChoiceReady = false;
        this.chartViewReady = false;
    }
}