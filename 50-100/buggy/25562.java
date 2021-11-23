@java.lang.Override
public boolean equals(java.lang.Object o) {
    if ((this) == o) {
        return true;
    }
    if ((o == null) || ((getClass()) != (o.getClass()))) {
        return false;
    }
    jackszm.androiddevtweets.support.Optional<?> optional = ((jackszm.androiddevtweets.support.Optional<?>) (o));
    return (data) != null ? data.equals(optional.data) : (optional.data) == null;
}