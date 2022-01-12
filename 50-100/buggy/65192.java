@org.junit.Before
public void setUp() throws java.lang.Exception {
    freeze = new me.trotyl.arena.effect.Freeze(2);
    player1 = spy(me.trotyl.arena.role.Player.create("张三", 10, 5));
    player2 = spy(me.trotyl.arena.role.Player.create("李四", 20, 8));
    attribute = spy(new me.trotyl.arena.attribute.Attribute((-1), 0.0F) {
        @java.lang.Override
        public me.trotyl.arena.record.DamageRecord apply(me.trotyl.arena.role.Attacker attacker, me.trotyl.arena.role.Attackable attackable) {
            return me.trotyl.arena.record.DamageRecord.none;
        }
    });
}