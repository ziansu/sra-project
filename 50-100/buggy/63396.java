public java.util.List<com.uts.sep.entity.ItemTbl> getItemsFiltedByPrice(double[] price) {
    java.util.List<com.uts.sep.entity.ItemTbl> tempList = new java.util.ArrayList<com.uts.sep.entity.ItemTbl>();
    for (com.uts.sep.entity.ItemTbl item : items)
        if (((item.getPrice()) >= (price[0])) && ((item.getPrice()) <= (price[1])))
            tempList.add(item);
        
    
    return tempList;
}