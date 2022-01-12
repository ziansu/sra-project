private java.lang.String resolveName(de.njsm.stocks.client.frontend.cli.Command c, java.lang.String prompt) {
    if (c.hasNext()) {
        java.lang.String inputName = c.next();
        if (de.njsm.stocks.client.frontend.cli.service.InputReader.isNameValid(inputName)) {
            return c.next();
        }else {
            writer.println("Name may not contain '=' or '$'");
        }
    }
    return reader.nextName(prompt);
}