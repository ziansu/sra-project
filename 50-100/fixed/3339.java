public java.lang.String max() {
    int maior;
    if (!(isEmpty())) {
        maior = 0;
        for (int i = 1; i < (n); i++) {
            if ((values[i]) > (values[maior]))
                maior = i;
            
        }
        return keys[maior];
    }
    throw new java.lang.NullPointerException("ST.contains(): key is null");
}