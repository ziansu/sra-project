public static void checkMultAnswer(MultChoice multChoice, java.lang.String inputAnswer) {
    if (((multChoice.getAnswer().equals(inputAnswer)) || (multChoice.getAltAnswer().equals(inputAnswer))) || (multChoice.getAltAnswer2().equals(inputAnswer))) {
        javax.swing.JOptionPane.showMessageDialog(Quiz.frame, "You're right! :)", "Dumb Quiz", javax.swing.JOptionPane.WARNING_MESSAGE);
    }else {
        javax.swing.JOptionPane.showMessageDialog(Quiz.frame, "You're wrong! :(", "Dumb Quiz", javax.swing.JOptionPane.ERROR_MESSAGE);
    }
}