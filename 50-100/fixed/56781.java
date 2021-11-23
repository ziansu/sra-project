@java.lang.Override
public int hashCode() {
    return new org.apache.commons.lang.builder.HashCodeBuilder().appendSuper(super.hashCode()).append(this.userID).append(this.groupId).append(this.attendanceSite.getId()).toHashCode();
}