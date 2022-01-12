public java.util.ArrayList getRecentlyReadCells(int howMany) {
    java.util.ArrayList resultList = new java.util.ArrayList();
    if ((history.size()) < 1)
        return resultList;
    
    for (int i = 1; i < (howMany + 1); i++) {
        if (i > (history.size()))
            break;
        
        resultList.add(history.get(((history.size()) - i)));
    }
    return resultList;
}