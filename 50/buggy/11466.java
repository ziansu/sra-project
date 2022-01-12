@java.lang.Override
public void setNumericBanner(int count) {
    if ((items.size) <= 1)
        super.setNumericBanner(count);
    else
        this.setMultipleBanner(count);
    
}