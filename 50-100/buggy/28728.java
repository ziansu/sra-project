public static void main(java.lang.String[] args) throws xaurora.text.ParseException {
    xaurora.text.XauroraParser parser = new xaurora.text.XauroraParser(java.lang.System.in);
    while (true) {
        try {
            xaurora.text.XauroraParser.getNumber();
        } catch (java.lang.Exception e) {
            java.lang.System.out.println("NOK.");
            java.lang.System.out.println(e.getMessage());
            xaurora.text.XauroraParser.ReInit(java.lang.System.in);
        } catch (java.lang.Error e) {
            java.lang.System.out.println("Oops.");
            java.lang.System.out.println(e.getMessage());
            xaurora.text.XauroraParser.ReInit(java.lang.System.in);
        }
    } 
}