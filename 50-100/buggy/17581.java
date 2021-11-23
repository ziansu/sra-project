public void corrupt(java.util.ArrayList list, int max) {
    int size = list.size();
    int howmanydeaths = 0;
    if (size > max) {
        howmanydeaths = size - max;
        if ((list.size()) >= howmanydeaths)
            for (int i = 0; i < (howmanydeaths - 2); i++)
                list.remove(i);
            
        
    }else
        if (size > 2)
            list.remove(0);
        
    
}