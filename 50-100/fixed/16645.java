@java.lang.Override
public void actionPerformed(java.awt.event.ActionEvent e) {
    java.lang.String review = reviewText.getText();
    java.lang.Double rating = java.lang.Double.valueOf(ratingField.getText());
    try {
        com.vgdatabase304.Adaptors.ReviewAdaptor.addReviewToDatabase(user, game, review, rating);
    } catch (java.sql.SQLException e1) {
        java.lang.System.out.println("Unable to submit review");
    }
}