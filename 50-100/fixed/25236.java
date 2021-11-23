public float GetProgressEnd() {
    if ((GetTotalContentHeight()) <= 0)
        return Progress;
    else
        if (((Progress) + ((GetPageHeight()) / (GetTotalContentHeight()))) < 1)
            return (Progress) + ((GetPageHeight()) / (GetTotalContentHeight()));
        else
            return 1;
        
    
}