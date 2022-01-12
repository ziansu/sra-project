private java.util.List<java.lang.String> postgreLauseet() {
    java.util.ArrayList<java.lang.String> lista = new java.util.ArrayList<>();
    lista.add("CREATE TABLE ALUE (alueID SERIAL PRIMARY KEY, nimi varchar(50));");
    lista.add("CREATE TABLE LANKA (lankaID SERIAL PRIMARY KEY, alueID integer NOT NULL, nimi varchar(50), FOREIGN KEY(alueID) REFERENCES ALUE(alueID));");
    lista.add("CREATE TABLE KAYTTAJA (kayttajaID SERIAL PRIMARY KEY, nimi varchar(50));");
    lista.add("CREATE TABLE VIESTI (viestiID SERIAL PRIMARY KEY, kayttajaID integer NOT NULL, lankaID integer NOT NULL, aika date, viesti varchar(300), FOREIGN KEY(kayttajaID) REFERENCES KAYTTAJA(kayttajaID), FOREIGN KEY(lankaID) REFERENCES LANKA(lankaID));");
    lista.add("INSERT INTO KAYTTAJA (kayttajaID, nimi) VALUES (1, 'Joonas');");
    lista.add("INSERT INTO KAYTTAJA (kayttajaID, nimi) VALUES (2, 'Mari');");
    lista.add("INSERT INTO ALUE (alueID, nimi) VALUES (1, 'Opiskelu');");
    lista.add("INSERT INTO ALUE (alueID, nimi) VALUES (2, 'Elämä');");
    lista.add("INSERT INTO LANKA (lankaID, nimi, alueID) VALUES (1, 'Tikape', 1);");
    lista.add("INSERT INTO VIESTI (viestiID, kayttajaID, lankaid, aika, viesti) VALUES (1, 1, 1, '2016-10-21T00:50:16Z', 'Osaamme ohjelmoida!');");
    return lista;
}