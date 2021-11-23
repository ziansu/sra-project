public float GetProgressEnd() {
    if (((Progress) + ((GetPageHeight()) / (GetTotalContentHeight()))) < 1)
        return (Progress) + ((GetPageHeight()) / (GetTotalContentHeight()));
    else
        return 1;
    
}