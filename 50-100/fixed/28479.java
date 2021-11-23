public int compare(edu.asu.spring.quadriga.domain.IConceptStats o1, edu.asu.spring.quadriga.domain.IConceptStats o2) {
    if ((o1.getCount()) == (o2.getCount()))
        return 0;
    
    return (o1.getCount()) < (o2.getCount()) ? 1 : -1;
}