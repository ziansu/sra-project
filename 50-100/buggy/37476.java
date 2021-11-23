public void doControl(beans.ControlState state) {
    for (beans.ControlState s : states) {
        if (s.getC().equals(state.getC())) {
            s.setSavedState(state.getSavedState());
            s.setState(state.getState());
            try {
                oos.writeObject(s);
            } catch (java.io.IOException e) {
                java.lang.System.out.println(e.toString());
            }
        }
    }
}