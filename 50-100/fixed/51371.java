private void checkoutMedia(java.lang.String media, com.twu.biblioteca.MediaList list) {
    java.lang.String mediaToCheckout = io.waitForUserStringInput((("Enter the " + media) + " title: "), false);
    boolean mediaCheckoutSuccessful = list.checkoutByTitle(mediaToCheckout);
    if (mediaCheckoutSuccessful) {
        io.print((("Thank you! Enjoy the " + media) + "."));
    }else {
        io.print((("That " + media) + " is not available."));
    }
}