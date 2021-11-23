public void validate() {
    org.apache.commons.lang.Validate.notNull(from);
    org.apache.commons.lang.Validate.notNull(to);
    org.apache.commons.lang.Validate.isTrue(((from.before(to)) || (from.equals(to))));
}