@java.lang.Override
public int getItemViewType(int position) {
    if ((listOfCards.get(position).getListOfTransactions()) == null) {
        return CARDREPORT;
    }else
        if ((listOfCards.get(position).getListOfTransactions()) != null) {
            return CARDDAY;
        }
    
    return -1;
}