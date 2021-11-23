public static void numeralSystemSelector() {
    switch (hw02.NumeralSystems.radix) {
        case 2 :
            java.lang.System.out.println(hw02.NumeralSystems.intoBinaryOrOctalNs());
            break;
        case 8 :
            java.lang.System.out.println(hw02.NumeralSystems.intoBinaryOrOctalNs());
            break;
        case 16 :
            java.lang.System.out.println(hw02.NumeralSystems.intoHexNs());
            break;
        default :
            java.lang.System.err.println("Неизвестное основание сс");
    }
}