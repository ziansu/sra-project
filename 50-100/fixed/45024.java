@java.lang.Override
public int compare(com.vDigit.rpm.dto.Job o1, com.vDigit.rpm.dto.Job o2) {
    java.util.Date createdDate1 = o1.getCreatedDate();
    java.util.Date createdDate2 = o2.getCreatedDate();
    if ((createdDate1 == null) || (createdDate2 == null)) {
        return -1;
    }
    return createdDate2.compareTo(createdDate1);
}