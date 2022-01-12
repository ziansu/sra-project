@java.lang.Override
public void run() {
    no.hist.aitel.team12.app.Email.sendEmail((((((((((("Dear " + (firstName.getText())) + " ") + (lastName.getText())) + ",\nYou have been created as a Centre Manager for ") + (centreName.getText())) + ".\nYour username is: ") + (username.getText())) + "\nYour password is: ") + (password)) + "\n\nPlease change your password at your earliest oppurtunity.\n Regards, System Administrator for the SSS system,\nTeam12"), new no.hist.aitel.team12.app.EmailAddress(email.getText()));
}