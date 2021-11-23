public void resetData(seedu.address.model.person.ReadOnlyPerson replacement) {
    java.util.Objects.requireNonNull(replacement);
    this.setName(replacement.getName());
    this.setPhone(replacement.getPhone());
    this.setEmail(replacement.getEmail());
    this.setAddress(replacement.getAddress());
    this.setRemark(replacement.getRemark());
    this.setTags(replacement.getTags());
    seedu.address.model.person.@seedu.address.model.person.Remove
    a tag;
}