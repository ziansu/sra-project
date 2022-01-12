@java.lang.Override
public void onPageAppear() {
    isVisible = true;
    if ((graphSpiner) != null)
        showGraph(graphSpiner.getSelectedItemPosition());
    
}