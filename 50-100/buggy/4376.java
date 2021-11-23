@java.lang.Override
public boolean isValid(ticketingsystem.Data data) {
    if (((data.getData()) == null) || ((data.getData().length()) != 8)) {
        return false;
    }else {
        java.lang.System.out.println(data.getData().matches("[a-z][a-z][a-z][a-z][0-9][0-9][0-9][0-9]"));
        return data.getData().matches("[a-z][a-z][a-z][a-z][0-9][0-9][0-9][0-9]");
    }
}