public void searchMaiorNumFurtos() {
    for (Furtos f : lista) {
        if (map.containsKey(f.getLogradouro())) {
            map.put(f.getLogradouro(), ((map.get(f.getLogradouro())) + 1));
        }else {
            map.put(f.getLogradouro(), 1);
        }
    }
    java.lang.System.out.println(map);
}