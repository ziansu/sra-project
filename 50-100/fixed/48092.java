public void actionPerformed(java.awt.event.ActionEvent event) {
    queries.update(conn.getConnections(), idText, customerText, summaryText, resolveTimeText, minutesSpentText, resolvedByText, priorityText, resolvedCheck, resolutionTextArea, descriptionTextArea, notesTextArea, frame, false);
    conn.closeConnection();
}