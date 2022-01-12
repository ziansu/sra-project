public static java.lang.String loaddir(int n) {
    if (((activity.ListAdmin.dirs.size()) != 0) && ((activity.ListAdmin.dirs.size()) > n))
        return activity.ListAdmin.dirs.get(n);
    else
        return null;
    
}