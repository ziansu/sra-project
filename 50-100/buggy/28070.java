public void setInetChannel(no.polaric.aprsd.AprsChannel ch) {
    no.polaric.aprsd.Main.ch1 = ch;
    no.polaric.aprsd.Main.igate.setChannels(no.polaric.aprsd.Main.ch2, no.polaric.aprsd.Main.ch1);
    no.polaric.aprsd.Main.db.getMsgProcessor().setChannels(no.polaric.aprsd.Main.ch2, no.polaric.aprsd.Main.ch1);
    no.polaric.aprsd.Main.ownpos.setChannels(no.polaric.aprsd.Main.ch2, no.polaric.aprsd.Main.ch1);
    no.polaric.aprsd.Main.ownobjects.setChannels(no.polaric.aprsd.Main.ch2, no.polaric.aprsd.Main.ch1);
}