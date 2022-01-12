@java.lang.Override
public int compare(com.vladimircvetanov.smartfinance.model.Transaction o1, com.vladimircvetanov.smartfinance.model.Transaction o2) {
    if (o1.category.equals(o2.category)) {
        if (o1.date.equals(o2.date))
            return ((java.lang.Double) (o2.sum)).compareTo(((java.lang.Double) (o1.sum)));
        
        return o2.date.compareTo(o1.date);
    }
    return o2.category.getName().compareTo(o1.category.getName());
}