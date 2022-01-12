public void printSendingInformation(Node sender, Node receiver, Node message) {
    if (message.getID().toString().equals("")) {
        println((((((("##############\nSender: " + (sender.getID())) + "\nReceiver: ") + (receiver.getID())) + "\nMessage: ") + (message.getID())) + "\n##############"));
    }
}