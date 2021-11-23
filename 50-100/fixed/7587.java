@java.lang.Override
public int hashCode() {
    return new org.apache.commons.lang.builder.HashCodeBuilder().append(username).append(firstName).append(lastName).append(email).append(active).append(country).append(sendReminder).toHashCode();
}