seedu.address.logic.Task test_deadline() throws java.lang.Exception {
    return new seedu.address.logic.Deadline("deadline", "this is a deadline", seedu.address.commons.util.DateUtil.parseStringIntoDateTime("13 Aug 16 1300").get(), new seedu.address.model.tag.UniqueTagList());
}