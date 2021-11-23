public static com.ly.badiane.budgetmanager_finalandroidproject.divers.Categorie getInstance(int i) {
    if ((i <= 5) && (i >= 0))
        return com.ly.badiane.budgetmanager_finalandroidproject.divers.Categorie.ALL.get(i);
    
    return null;
}