public java.util.List<com.uts.sep.entity.ItemTbl> getItemsFiltedByPrice(double[] price) {
    tempList = null;
    for (com.uts.sep.entity.ItemTbl item : items)
        if (((item.getPrice()) >= (price[0])) && ((item.getPrice()) <= (price[1])))
            tempList.add(item);
        
    
    return tempList;
}