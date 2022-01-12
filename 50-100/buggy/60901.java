@java.lang.Override
public int compare(com.shaurun.site.model.News o1, com.shaurun.site.model.News o2) {
    int dateCompare = o1.getDate().compareTo(o2.getDate());
    if (dateCompare == 0) {
        return (o1.getId()) > (o2.getId()) ? -1 : (o1.getId()) == (o2.getId()) ? 0 : 1;
    }
    return dateCompare;
}