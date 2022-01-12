@java.lang.Override
public boolean equals(java.lang.Object other) {
    if ((targetTags) == null) {
        return (other == (this)) || ((other instanceof seedu.address.logic.commands.DeleteCommand) && (this.targetIndex.equals(((seedu.address.logic.commands.DeleteCommand) (other)).targetIndex)));
    }else {
        return (other == (this)) || ((other instanceof seedu.address.logic.commands.DeleteCommand) && (this.targetIndex.equals(((seedu.address.logic.commands.DeleteCommand) (other)).targetIndex)));
    }
}