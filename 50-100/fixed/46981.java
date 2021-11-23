public static ar.edu.itba.it.paw.model.Dish.Type getDishTypeFromString(java.lang.String type) {
    java.lang.System.out.println(type);
    if ("entry".equals(type))
        return ar.edu.itba.it.paw.model.Dish.Type.ENTRY;
    else
        if ("main".equals(type))
            return ar.edu.itba.it.paw.model.Dish.Type.MAIN;
        else
            if ("dessert".equals(type))
                return ar.edu.itba.it.paw.model.Dish.Type.DESSERT;
            else
                return ar.edu.itba.it.paw.model.Dish.Type.DRINK;
            
        
    
}