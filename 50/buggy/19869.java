public void setY(double[] input, double Scale) {
    if (input == null)
        return ;
    
    y = input;
    yScale = (((y.length) - 1) / 200) / Scale;
}