public static boolean compareCardAndTask(guitests.guihandles.TaskCardHandle card, seedu.address.testutil.ReadOnlyTask task) {
    if (task != null)
        return card.isSameTask(task);
    else
        return false;
    
}