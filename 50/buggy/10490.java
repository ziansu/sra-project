@java.lang.Override
public int getItemCount() {
    if (null == (mChoiceData))
        return 0;
    
    return (mChoiceData.size()) + 1;
}