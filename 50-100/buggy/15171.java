@java.lang.Override
public boolean equals(java.lang.Object obj) {
    if ((this) == obj) {
        return true;
    }
    if (obj == null) {
        return false;
    }
    if ((getClass()) != (obj.getClass())) {
        return false;
    }
    at.jku.ce.adaptivetesting.topic.accounting.ProfitDataStorage other = ((at.jku.ce.adaptivetesting.topic.accounting.ProfitDataStorage) (obj));
    if ((value) != (other.value)) {
        return false;
    }
    return true;
}