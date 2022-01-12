@java.lang.Override
public boolean equals(java.lang.Object o) {
    if (o == (this)) {
        return true;
    }
    if (o instanceof com.github.mzule.activityrouter.router.Mapping) {
        com.github.mzule.activityrouter.router.Mapping that = ((com.github.mzule.activityrouter.router.Mapping) (o));
        return that.format.equals(((com.github.mzule.activityrouter.router.Mapping) (o)).format);
    }
    return false;
}